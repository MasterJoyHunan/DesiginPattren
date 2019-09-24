package interpreter;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Context context = new Context();
        Map<String, Object> param = new HashMap<>();
        Map<String, Object> where = new HashMap<>();
        param.put("aoe", "xf");
        param.put("xdf", "sdq");
        where.put("xcg", "wq");
        where.put("xcd", "sdfg");

        context.setTbName("tables");
        context.setWhere(where);
        context.setParam(param);

        SqlExpression insert = new InsertExpression();
        insert.interpret(context);

        SqlExpression update = new UpdateExpression();
        update.interpret(context);
    }
}
