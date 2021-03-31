package com.hao123.core.Controller;

import ch.qos.logback.classic.Logger;
import com.alibaba.excel.EasyExcel;
import com.hao123.core.Entity.TeacherEntity;
import com.hao123.core.Util.GetExcelData;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * @author cvbnt
 */
@Controller
public class ExportExcelController {
    final Logger logger = (Logger) LoggerFactory.getLogger(ExportExcelController.class);
    @Autowired
    private GetExcelData getExcelData;

    @RequestMapping("/pages/exportexcel")
    public void exportExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");

        String fileName = String.valueOf(LocalDateTime.now().withNano(0));
        response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName + ".xlsx");
        EasyExcel.write(response.getOutputStream(), TeacherEntity.class).sheet("模板").doWrite(getExcelData.data());
        logger.info("导出成功");
    }
}
