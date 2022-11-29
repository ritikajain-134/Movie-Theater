package com.support;

import com.database.Database_Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Kunal
 */
public abstract class getItemData {

    public ResultSet getResultset(String path) throws SQLException {
        Database_Connection db = new Database_Connection();
        String quree = "SELECT * FROM movies_data where `poster_path` = '" + path + "'";
        ResultSet rs = db.stmt.executeQuery(quree);
        return rs;
    }

    public abstract void setData();

    public abstract void getData();

}
