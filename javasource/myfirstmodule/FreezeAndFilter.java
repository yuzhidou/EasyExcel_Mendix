package myfirstmodule;
import com.alibaba.excel.write.handler.SheetWriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;

public class FreezeAndFilter implements SheetWriteHandler {

    public int colSplit = 0, rowSplit = 2, leftmostColumn = 0, topRow = 2;
    public String autoFilterRange = "2:2";

    @Override
    public void beforeSheetCreate(WriteWorkbookHolder writeWorkbookHolder, WriteSheetHolder writeSheetHolder) {

    }

    @Override
    public void afterSheetCreate(WriteWorkbookHolder writeWorkbookHolder, WriteSheetHolder writeSheetHolder) {
        Sheet sheet = writeSheetHolder.getSheet();
        sheet.createFreezePane(colSplit, rowSplit, leftmostColumn, topRow);
        sheet.setAutoFilter(CellRangeAddress.valueOf(autoFilterRange));
    }
}