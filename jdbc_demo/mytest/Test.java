package mytest;

import java.util.*;

public class Test {
    static BookInfoDao bookInfoDao = new BookInfoDao();
    static final String  TABLE = "tbl_book_info";
    static Map<String,Object> map = new HashMap<>();
    static List<Map<String,Object>> books = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    /**
     * 添加图书
     */
    public static void addBook(){
        System.out.println("请输入您要添加的图书信息:");
        System.out.println("图书编号:");
        String no = scanner.next();
        System.out.println("图书名称:");
        String name = scanner.next();
        System.out.println("图书价格:");
        String price = scanner.next();

        map.put("no",no);
        map.put("name",name);
        map.put("price",price);

        String sql = "insert into "+TABLE+"(b_no,b_name,b_price) values('"+map.get("no")+"','"+map.get("name")+"',"+map.get("price")+")";
        bookInfoDao.executeUpdate(sql);

        books.add(map);
    }
    /**
     *查询图书
     */
    public static void searchBook(){
        System.out.println("1、查询所有图书\n2、按图书编号查询\n请输入您的选择：");
        int nextInt = scanner.nextInt();
        Object next1=null;
        switch (nextInt){
            case 1:
                String sql = "select b_no '图书编号',b_name '图书名称',b_price '图书价格',b_status '图书状态' from "+TABLE;
                System.out.println(bookInfoDao.executeQuery(sql));
                break;
            default:
                System.out.println("输入有误！");confirm();
                break;
        }
    }

    /**
     * 修改图书
     */
    public static void updateBook(){
        System.out.println("请输入您要修改的图书编号:");
        int no = scanner.nextInt();
        System.out.println("请输入您要修改的图书名称:");
        String name = scanner.next();
        System.out.println("请输入您要修改的图书价格:");
        int price = scanner.nextInt();
        System.out.println("请输入您要修改的图书状态:");
        int status = scanner.nextInt();
        String sql = "update "+TABLE+" set b_name='"+name+"',b_price="+price+",b_status="+status+" where b_no='"+no+"'";
        bookInfoDao.executeUpdate(sql);
    }

    /**
     * 删除图书
     */
    public static void deleteBook(){
        System.out.println("请输入您要删除的图书编号:");
        int no = scanner.nextInt();
        String sql = "delete from "+TABLE+" where b_no='"+no+"'";
        bookInfoDao.executeUpdate(sql);
    }
    /**
     * 确认返回主菜单或退出
     */
    public static void confirm(){

        System.out.println("是否返回主菜单(1、返回，2、退出)");
        int n = scanner.nextInt();
        switch (n){
            case 1:menu();break;
            case 2:
                System.out.println("程序结束");break;
            default:
                System.out.println("输入有误！");confirm();
                break;
        }
    }

    /**
     * 主菜单
     */
    public static void menu(){
        System.out.println("图书管理");
        System.out.println("1、添加图书");
        System.out.println("2、查询图书");
        System.out.println("3、修改图书");
        System.out.println("4、删除图书");
        System.out.println("请输入您的选择:");
        int n = scanner.nextInt();
        switch (n){
            case 1:
                addBook();confirm();break;
            case 2:
                searchBook();confirm();break;
            case 3:
                updateBook();confirm();break;
            case 4:
                deleteBook();confirm();break;
            default:
                System.out.println("输入有误！");confirm();break;
        }
    }
}
