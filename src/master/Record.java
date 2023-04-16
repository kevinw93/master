package master;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Record {

    private Connection connection;
    private ArrayList<Table> results;
    private ResultSet rs;

    public ArrayList<Table> getResults() {
        return results;
    }

    public void setResults(ArrayList<Table> results) {
        this.results = results;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public Record() {
        super();
        this.setResults(new ArrayList<Table>());
    }

    //Connection

    public boolean connectDb() {
        String loadPath = ""
    }
}
