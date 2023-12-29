import java.util.List;

public class Main {
    public static int findMax(List<Integer> numbers){
        int max = 0;
        for (Integer number : numbers) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("E:\\Bootcamp Java Fullstack\\C1023H1-JV101-NguyenVanHaiNhat\\Module_2\\ss16_IO_Text_File\\ReadAndWriteFile\\max");
        int maxValue = findMax(numbers);
        readAndWriteFile.writerFile("E:\\Bootcamp Java Fullstack\\C1023H1-JV101-NguyenVanHaiNhat\\Module_2\\ss16_IO_Text_File\\ReadAndWriteFile\\result", maxValue);
    }
}
