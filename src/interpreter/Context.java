package interpreter;

import java.util.Map;

/**
 * @author joy
 * @time 2019/09/21 11:24
 */
public class Context {

    private String tbName;

    private Map<String, Object> where;

    private Map<String, Object> param;

    public String getTbName() {
        return tbName;
    }

    public void setTbName(String tbName) {
        this.tbName = tbName;
    }

    public Map<String, Object> getWhere() {
        return where;
    }

    public void setWhere(Map<String, Object> where) {
        this.where = where;
    }

    public Map<String, Object> getParam() {
        return param;
    }

    public void setParam(Map<String, Object> param) {
        this.param = param;
    }
}
