package com.entor.converter;

import com.opensymphony.xwork2.conversion.TypeConversionException;
import org.apache.struts2.util.StrutsTypeConverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class DateConverter extends StrutsTypeConverter {

    // 支持转换的多种日期格式，可增加时间格式
    private final SimpleDateFormat[] df = {
            new SimpleDateFormat("yyyy年MM月dd日"),
            new SimpleDateFormat("yyyy.MM.dd"),
            new SimpleDateFormat("yyyy-MM-dd"),
            new SimpleDateFormat("MM/dd/yyyy"),
            new SimpleDateFormat("yyyy/MM/dd")
    };

    /**
     * 从字符串转换成日期
     * @param context
     * @param values
     * @param toClass
     * @return
     */
    @Override
    public Object convertFromString(Map context, String[] values, Class toClass) {
        String dateStr = values[0];
        for (int i =0; i < df.length; i++) {
            // 遍历，进行转换
            try {
                return df[i].parse(dateStr);
            } catch (ParseException e) {
                continue;
            }
        }
        // 如果遍历后没有转换成功则抛出异常
        throw new TypeConversionException();
    }

    /**
     * 从日期转换成字符串
     * @param map
     * @param o
     * @return
     */
    @Override
    public String convertToString(Map map, Object o) {
        Date date = (Date) o;
        // 输出格式为yyyy-MM-dd
        return new SimpleDateFormat("yyyy-MM-dd").format(date);
    }
}
