/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;


/**
 *
 * @author thantzinsoe
 */
public class ExcelWriteData   {
    
    
  

    public static void main(String[] args) throws IOException, WriteException {
       File path= new File("/Users/macbookpro/Desktop/JavaIO Test/myExcel.xls");
        WritableWorkbook excel=Workbook.createWorkbook(path);
        WritableSheet mySheet=excel.createSheet("Java Mark", 0);
        
        Label hName=new Label(0,0,"Name");
        Label hMark=new Label(1,0,"Mark");
        Label hSub=new Label(2,0,"Subject");
        
        Label s1N=new Label(0,1,"TZS");
        Label s1M=new Label(1,1,"40");
        Label s1S=new Label(2,1,"Java");
        
        Label s2N=new Label(0,2,"ZMO");
        Label s2M=new Label(1,2,"60");
        Label s2S=new Label(2,2,"Java");
        
         Label s3N=new Label(0,3,"AZM");
        Label s3M=new Label(1,3,"75");
        Label s3S=new Label(2,3,"Java");
        
        mySheet.addCell(hName);
        mySheet.addCell(hMark);
        mySheet.addCell(hSub);
        
        mySheet.addCell(s1N);
        mySheet.addCell(s1M);
        mySheet.addCell(s1S);
        
        mySheet.addCell(s2N);
        mySheet.addCell(s2M);
        mySheet.addCell(s2S);
        
        mySheet.addCell(s3N);
        mySheet.addCell(s3M);
        mySheet.addCell(s3S);
        
        excel.write();
        excel.close();
        System.out.println("Finished.......");
        
        
    }
    
}
