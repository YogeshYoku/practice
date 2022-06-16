package org.sample;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.Data1;
import com.pojo.Employee1;
import com.pojo.Support1;
public class Sample3 {
public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
File file=new File("C:\\Users\\orton\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\Sample\\hello.json");
ObjectMapper mapper=new ObjectMapper();
List<Data1>datas=new ArrayList<Data1>();
Data1 d1=new Data1("7", "michael.lawson@reqres.in", "Michael", "Lawson", "https://reqres.in/img/faces/7-image.jpg");
Data1 d2=new Data1("8", "lindsay.ferguson@reqres.in", "Lindsay", "Ferguson", "https://reqres.in/img/faces/8-image.jpg");
Data1 d3=new Data1("9", "tobias.funke@reqres.in", "Tobias", "Funke", "https://reqres.in/img/faces/9-image.jpg");
Data1 d4=new Data1("10", "byron.fields@reqres.in", "Byron", "Fields", "https://reqres.in/img/faces/10-image.jpg");
Data1 d5=new Data1("11", "george.edwards@reqres.in", "George", "Edwards", "https://reqres.in/img/faces/11-image.jpg");
Data1 d6=new Data1("12", "rachel.howell@reqres.in", "Rachel", "Howell", "https://reqres.in/img/faces/12-image.jpg");
datas.add(d1);
datas.add(d2);
datas.add(d3);
datas.add(d4);
datas.add(d5);
datas.add(d6);
Support1 support1=new Support1("https://reqres.in/#support-heading", "To keep ReqRes free, contributions towards server costs are appreciated!");
Employee1 emp=new Employee1("2", "6", "12", "2", datas, support1);
mapper.writeValue(file, emp);
}
}
