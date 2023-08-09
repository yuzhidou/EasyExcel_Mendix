package myfirstmodule;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import com.alibaba.excel.annotation.write.style.HeadFontStyle;
import com.alibaba.excel.annotation.write.style.HeadStyle;
import com.alibaba.excel.annotation.write.style.ContentFontStyle;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.ContentStyle;
import com.alibaba.excel.enums.BooleanEnum;
import com.alibaba.excel.enums.poi.HorizontalAlignmentEnum;

@ContentRowHeight(13)
@HeadRowHeight(22)
@ColumnWidth(25)
@HeadFontStyle(fontHeightInPoints = 10,bold=BooleanEnum.FALSE,fontName="宋体")
@HeadStyle(fillForegroundColor = 1)
@ContentFontStyle(bold=BooleanEnum.FALSE,fontName="宋体",fontHeightInPoints=10)
@ContentStyle(horizontalAlignment=HorizontalAlignmentEnum.CENTER)
public class MyTestUser {
    @ColumnWidth(20)
    @ExcelProperty({"姓名"})
    private String name;
    @ColumnWidth(20)
    @ExcelProperty({"年龄"})
    private String age;
    @ColumnWidth(20)
    @ExcelProperty({"联系方式","手机号码"})
    private String phone;
    @ColumnWidth(20)
    @ExcelProperty({"联系方式","电子邮箱"})
    private String mail;
    @ColumnWidth(20)
    @ExcelProperty({"户籍所在地","省"})
    private String sheng;
    @ColumnWidth(20)
    @ExcelProperty({"户籍所在地","市"})
    private String shi;
    @ColumnWidth(20)
    @ExcelProperty({"户籍所在地","区"})
    private String qu;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSheng() {
        return sheng;
    }

    public void setSheng(String sheng) {
        this.sheng = sheng;
    }

    public String getShi() {
        return shi;
    }

    public void setShi(String shi) {
        this.shi = shi;
    }

    public String getQu() {
        return qu;
    }

    public void setQu(String qu) {
        this.qu = qu;
    }
}