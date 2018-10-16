package com.rollean.zb.service.velocity;

import com.rollean.zb.common.util.StringUtil;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.tools.generic.MathTool;
import org.springframework.util.CollectionUtils;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by rollean.
 */
public class VelocityUtil {

    /** 引擎对象 */
    private static VelocityEngine ve = null;

    /**
     * 获取引擎
     * @return
     */
    public static VelocityEngine loadEngine() {
        if (ve != null) {
            return ve;
        }
        synchronized (VelocityUtil.class) {
            if (ve != null) {
                return ve;
            }

            // 初始化
            VelocityEngine veInit = new VelocityEngine();
            try {
                veInit.init();
            } catch (Exception e) {
                e.printStackTrace();
            }
            ve = veInit;
        }

        return ve;
    }


    public static String getString(String templateContent, Map<String, Object> paramMap)
            throws Exception {
        if (StringUtil.isBlank(templateContent)) {
            return null;
        }

        VelocityContext context = new VelocityContext();
        context.put("math", new MathTool());
        if (!CollectionUtils.isEmpty(paramMap)) {
            for (Map.Entry<String, Object> entry : paramMap.entrySet()) {
                context.put(entry.getKey(), entry.getValue());
            }
        }

        StringWriter writer = new StringWriter();
        try {
            loadEngine().evaluate(context, writer, "velocity", templateContent);

            return writer.toString();
        } catch (Exception e) {
            throw new Exception("表达式[" + templateContent + "]解析异常", e);
        }
    }


    public static void main(String[] args) {
        try {
            String test = "#if(${test1}>2) $math.mul('11','7') #else $math.mul(${test1},1) #end";
            Map<String, Object> paramMap = new HashMap<String, Object>();
            paramMap.put("test1", 2);
            System.out.println(getString(test, paramMap));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }





}
