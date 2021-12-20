/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity.satu.Activity.satu.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Lenovo
 */
@Controller
public class DataKTP {
   
    @RequestMapping("/mytable")
    public String getTable(Model Data){
        
    ArrayList<List<String>> data = new ArrayList <>();
        
        data.add(Arrays.asList("ID", "Nomor KTP", "Nama", "Alamat"));
        data.add(Arrays.asList("001", "101027020001", "Jordy", "Jambi"));
        data.add(Arrays.asList("002", "101028020001", "Anjana", "Sragen"));
        data.add(Arrays.asList("003", "101029020001", "Tata", "Bengkulu"));
        data.add(Arrays.asList("004", "101030020001", "Rizki", "Jambi"));
        data.add(Arrays.asList("005", "101031020001", "Dana", "Jambi"));
        data.add(Arrays.asList("006", "101032020001", "Akbar", "Jambi"));
        data.add(Arrays.asList("007", "101033020001", "Sibli", "Lombok"));
        data.add(Arrays.asList("008", "101034020001", "Reza", "Pekanbaru"));
        data.add(Arrays.asList("009", "101035020001", "Riko", "Yogyakarta"));
        data.add(Arrays.asList("010", "101036020001", "Fadhil", "Yogyakarta"));
        data.add(Arrays.asList("011", "101037020001", "Joni", "Yogyakarta"));
        data.add(Arrays.asList("012", "101038020001", "Ijad", "Surakarta"));
        data.add(Arrays.asList("013", "101039020001", "Yoga", "Palembang"));
        data.add(Arrays.asList("014", "101040020001", "Zulfa", "Bengkulu"));
        data.add(Arrays.asList("015", "101041020001", "Belinda", "Sragen"));
        data.add(Arrays.asList("016", "101042020001", "Aulia", "Bandung"));
        data.add(Arrays.asList("017", "101043020001", "Dede", "Samarinda"));
        data.add(Arrays.asList("018", "101044020001", "Fajar", "Sulawesi"));
        data.add(Arrays.asList("019", "101045020001", "Rudi", "Padang"));
        data.add(Arrays.asList("020", "101046020001", "Bima", "Bekasi"));
        data.add(Arrays.asList("021", "101047020001", "Katak", "Tanggerang"));
        
        Data.addAttribute("table", data);
        
        
        return "tableViewer";
    }
    
}
