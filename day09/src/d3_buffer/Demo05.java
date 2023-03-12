package d3_buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//目标：把《出师表》的文章顺序进行恢复到一个新文件中
public class Demo05 {
    public static void main(String[] args) throws Exception {
        //思路：可以先把文件中的每一行读出之后放入集合中排序，然后再从集合中取出，并写出到文件中
        //把每一行添加到集合中
        FileReader fr = new FileReader("day09\\csb.txt");
        BufferedReader br = new BufferedReader(fr);
        ArrayList<String> list = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null){
            list.add(line);
        }
        br.close();

        //对每一行进行排序
        ArrayList<String> orders = new ArrayList<>();
        Collections.addAll(orders,"一","二","三","四","五","陆","柒","八","九","十","十一");
        //排序的规则：按照每一行首位字符，在orders集合中的索引来进行排序(索引在前就说明元素在前，索引在后就说明元素在后)
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] split1 = o1.split("\\.");
                String[] split2 = o2.split("\\.");
                String s1 = split1[0];
                String s2 = split2[0];
                int index1 = orders.indexOf(s1);
                int index2 = orders.indexOf(s2);
                return index1 - index2;
            }
        });

        BufferedWriter bw = new BufferedWriter(new FileWriter("day09\\csb2.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();

    }
}
