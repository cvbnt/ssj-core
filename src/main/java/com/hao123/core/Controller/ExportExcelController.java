package com.hao123.core.Controller;

import com.alibaba.excel.EasyExcel;
import com.hao123.core.Entity.TeacherEntity;
import com.hao123.core.Util.GetExcelData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author cvbnt
 */
@Controller
public class ExportExcelController {
    private final GetExcelData getExcelData;

    public ExportExcelController(GetExcelData getExcelData) {
        this.getExcelData = getExcelData;
    }

    @RequestMapping("/pages/exportexcel")
    public void exportExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");

        SimpleDateFormat sdf = new SimpleDateFormat();
        // 格式化时间
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
        // a为am/pm的标记
        Date date = new Date();
        // 获取当前时间
        String fileName = sdf.format(date);
        response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName + ".xlsx");
        EasyExcel.write(response.getOutputStream(), TeacherEntity.class).sheet("模板").doWrite(getExcelData.data());
    }
}
