package interpreter;

import java.util.Map;

/**
 * 改
 */
public class UpdateExpression implements SqlExpression {

    @Override
    public void interpret(Context context) {
        StringBuffer str   = new StringBuffer("update ");
        String       table = context.getTbName();
        str.append(table + " set ");
        Map<String, Object> params = context.getParam();
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            str.append(entry.getKey() + " = " + entry.getValue() + ",");
        }
        str.replace(str.length() - 1, str.length(), "");
        str.append("where 1 = 1 ");
        Map<String, Object> where = context.getParam();
        for (Map.Entry<String, Object> entry : where.entrySet()) {
            str.append(" and " + entry.getKey() + " = " + entry.getValue());
        }

        System.out.println(str.toString());
    }
}
