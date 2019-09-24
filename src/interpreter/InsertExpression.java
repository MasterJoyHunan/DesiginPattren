package interpreter;

import java.util.Map;

/**
 * 增
 */
public class InsertExpression implements SqlExpression {

    @Override
    public void interpret(Context context) {

        StringBuffer str = new StringBuffer("insert into ");
        String table = context.getTbName();
        str.append(table + " ");
        Map<String, Object> params = context.getParam();

        str.append("( ");
        for (Map.Entry<String, Object> entry: params.entrySet()) {
            str.append(entry.getKey() + ",");
        }
        str.replace(str.length() - 1, str.length(), "");
        str.append(" )");
        for (Map.Entry<String, Object> entry: params.entrySet()) {
            str.append(entry.getValue() + ",");
        }

        System.out.println(str.toString());
    }
}
