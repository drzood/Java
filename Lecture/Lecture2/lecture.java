package Lecture.Lecture2;
import java.io.File;
public class lecture {
    public static void main(String[] args) {
        /* 
        String  -   много изменений   - разбор готового полученного материала
        StringBuilder - много пребразований - компановка и сбор материала

        Строки
concat(): объединение строк
valueOf(): преобразует Object в строковое представление (завязан на toString())
join(): объединяет набор строк в одну с учетом разделителя
charAt(): получение символа по индексу
indexOf(): первый индекс вхождения подстроки
lastIndexOf(): последний индекс вхождения подстроки
startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
replace(): замена одной подстроки на другую
trim(): удаляет начальные и конечные пробелы
substring(): возвращает подстроку, см.аргументы
toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
сompareTo(): сравнивает две строки
equals(): сравнивает строки с учетом регистра
equalsIgnoreCase(): сравнивает строки без учета регистра
regionMatches(): сравнивает подстроки в строках

        Файлы
File <имя> = new File(<полный путь к файлу>);
File f1 = new File("file.txt");
File f2 = new File("/Users/sk/vscode/java_projects/file.txt");
        */
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/file.txt");
        File f3 = new File(pathFile);
        System.out.println(f3.getAbsolutePath());
        // /Users/sk/vscode/java_projects/file.txt
        // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt
        /*
sHidden(): возвращает истину, если каталог или файл является скрытым
length(): возвращает размер файла в байтах
lastModified(): возвращает время последнего изменения файла или каталога
list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
listFiles(): возвращает массив файлов и подкаталогов, которые находятся 
в определенном каталоге
mkdir(): создает новый каталог
renameTo(File dest): переименовывает файл или каталог
length(): возвращает размер файла в байтах
lastModified(): возвращает время последнего изменения 
файла или каталога
list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
listFiles(): возвращает массив файлов и подкаталогов, которые 
находятся в определенном каталоге
mkdir(): создает новый каталог
renameTo(File dest): переименовывает файл или каталог
         */
    }
}
