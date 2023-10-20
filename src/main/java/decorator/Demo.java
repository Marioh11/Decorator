package decorator;
        
public class Demo {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nIker Casillas,10010\nLuis Gustavo Ruano,912\nMario Balotelli,5000";
        DataSourceDecorator encoded = new compression(
                                         new EncryptionDemo(
                                             new FileDataSource("C:\\Users\\mario\\OneDrive\\Documentos\\NetBeansProjects\\DecoratorM\\src\\main\\java\\decorator\\Out\\Outputdemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("C:\\Users\\mario\\OneDrive\\Documentos\\NetBeansProjects\\DecoratorM\\src\\main\\java\\decorator\\Out\\Outputdemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }    
}
