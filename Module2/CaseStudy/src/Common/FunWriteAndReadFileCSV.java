package Common;

import Models.Villa;
import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class FunWriteAndReadFileCSV {
    private static final char DEFAULT_SEPARATOR = ',';
    private static final char DEFAULT_QUOTE = '"';
    private static final String pathVilla = "src/data/Villa.csv";
    private static String[] headerRecordVilla = new String[]{"id","servicesName","aresUsed","maxOfPeople","type","roomStandard","convenientOther","poolArea","floor"};
    // write villa to file csv
    public static void writeVillaToFileCsv(ArrayList<Villa> arrayList){
        try(Writer writer = new FileWriter(pathVilla);
            CSVWriter csvWriter = new CSVWriter(writer,CSVWriter.DEFAULT_SEPARATOR,
                                                       CSVWriter.NO_QUOTE_CHARACTER,
                                                       CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                                                       CSVWriter.DEFAULT_LINE_END)){
            csvWriter.writeNext(headerRecordVilla);
            for(Villa villa: arrayList){
                csvWriter.writeNext(new String[]{
                    villa.getId(),
                    villa.getServicesName(),
                    String.valueOf(villa.getAresUsed()),
                        String.valueOf(villa.getMaxOfPeople()),
                        villa.getType(),
                        villa.getRoomStandard(),
                        villa.getConvenientOther(),
                        String.valueOf(villa.getPoolArea()),
                        String.valueOf(villa.getFloor())

                });
            }
        }
        catch (IOException ex){

        }
    }
}
