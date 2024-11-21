package app.vdb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;

import java.util.Collections;
import java.util.List;

@Service
public class ExclusionService {

    private static final Logger logger = LoggerFactory.getLogger(ExclusionService.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<String> getPidsFromTable(String api) {
        // Validate the table name to ensure it's safe to use
        if (!isValidTableName(api)) {
            logger.error("Invalid table name provided: {}", api);
            return Collections.emptyList();
        }

        // Construct the SQL query with the validated table name
        String sql = "SELECT pid FROM " + api;  // Directly insert table name after validation

        try {
            // Execute the query
            return jdbcTemplate.queryForList(sql, String.class);
        } catch (DataAccessException e) {
            logger.error("Error fetching PIDs from table: {}", api, e);
            return Collections.emptyList();
        }
    }

    private boolean isValidTableName(String tableName) {
        // Validate table name to only contain alphanumeric characters and underscores
        return tableName.matches("[a-zA-Z0-9_]+");  // Allow only valid table name characters
    }
}
