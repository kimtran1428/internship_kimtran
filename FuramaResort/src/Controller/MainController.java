package Controller;

import models.House;
import models.Room;
import models.Villa;
import models.customer;
import java.util.Date;

import java.awt.*;
import java.util.*;
import java.util.List;

public class MainController {
    public static List<Villa> villaList = new ArrayList<>();
    public static List<House> houseList = new ArrayList<>();
    public static List<Room> roomList = new ArrayList<>();
    public static List<customer> customerList = new ArrayList<>();
    public static TreeSet<Villa> villaTreeSet = new TreeSet<>();
    public static TreeSet<House> houseTreeSet = new TreeSet<>();
    public static TreeSet<Room> roomTreeSet = new TreeSet<>();
    public static Scanner input(){
        Scanner sc = new Scanner (System.in);
        return sc;
    }
    public static void main(String[] args){
        displayMainMenu();

    }
    public static void displayMainMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Add New Service");
        System.out.println("2.Show Service");
        System.out.println("3.Add New Customer");
        System.out.println("4.Add Information of Customer");
        System.out.println("5.Add New Booking");
        System.out.println("6.Add Information of Employee");
        System.out.println("7.Exit");
        switch (input().nextInt()){
            case 1:
                addNewService();
                break;
            case 2:
                showService();
                break;
//            case 3:
//                addNewCustomer();
//                break;
        }
    }
    public static void addNewService(){
        while (true) {
            System.out.println("1.Add New Villa");
            System.out.println("2.Add New House");
            System.out.println("3.Add New Room");
            System.out.println("4.Back to menu");
            System.out.println("5.Exit");
            switch (input().nextInt()) {
                case 1:
                    addNewVilla();
                    break;
                case 2:
                    addNewHouse();
                    break;
                case 3:
                    addNewRoom();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Nh???p kh??ng ????ng!!");
                    System.out.println("H??y nh???p l???i");
                    break;
            }
        }
    }
    public static void show(){
        villaTreeSet.addAll(villaList);
        for(Villa villa : villaTreeSet){
            System.out.println(villa.showInfor());
        }
    }
    public static void addNewVilla(){
        System.out.println("Nh???p t??n d???ch v???:");
        String tenDichVu = input().nextLine();
        System.out.println("Nh???p s??? l?????ng ng?????i:");
        String soLuongNguoiToiDa = input().nextLine();
        System.out.println("Nh???p di???n t??ch s??? d???ng:");
        int dienTichSuDung = input().nextInt();
        System.out.println("Nh???p ki???u thu??: ");
        String kieuThue = input().nextLine();
        System.out.println("Ti??u chu???n ph??ng: ");
        String tieuChuanPhong = input().nextLine();
        System.out.println("M?? t??? ti???n nghi kh??c");
        String moTaTienNghiKhac = input().nextLine();
        System.out.println("Di???n t??ch h??? b??i");
        int dienTichHoBoi = input().nextInt();
        System.out.println("S??? T???ng");
        int soTang = input().nextInt();
        System.out.println("Chi Ph?? Thu??");
        Double chiPhiThue = input().nextDouble();
        Villa villa = new Villa(tenDichVu, soLuongNguoiToiDa, dienTichSuDung, kieuThue, chiPhiThue,
                tieuChuanPhong, moTaTienNghiKhac, dienTichHoBoi, soTang);
        villaList.add(villa);
    }
    public static void showVilla(){
        for(Villa villa : villaList){
            System.out.println(villa.showInfor());
        }
    }
    public static void addNewHouse(){
        System.out.println("Nh???p t??n d???ch v???:");
        String tenDichVu = input().nextLine();
        System.out.println("Nh???p s??? l?????ng ng?????i:");
        String soLuongNguoiToiDa = input().nextLine();
        System.out.println("Nh???p di???n t??ch s??? d???ng:");
        int dienTichSuDung = input().nextInt();
        System.out.println("Nh???p ki???u thu??: ");
        String kieuThue = input().nextLine();
        System.out.println("Chi Ph?? Thu??: ");
        Double chiPhiThue  = input().nextDouble();
        System.out.println("M?? t??? ti???n nghi kh??c");
        String moTaTienNghiKhac = input().nextLine();
        System.out.println("Ti??u Chu???n Ph??ng");
        String tieuChuanPhong = input().nextLine();
        System.out.println("S??? T???ng");
        int soTang = input().nextInt();
        House house = new House(tenDichVu, soLuongNguoiToiDa, dienTichSuDung, kieuThue, chiPhiThue, moTaTienNghiKhac,
                tieuChuanPhong, soTang);
        houseList.add(house);
    }
    public static void showHouse(){
        for(House house :houseList){
            System.out.println(house.showInfor());
        }
    }
    public static void addNewRoom(){
        System.out.println("Nh???p t??n d???ch v???:");
        String tenDichVu = input().nextLine();
        System.out.println("Nh???p s??? l?????ng ng?????i:");
        String soLuongNguoiToiDa = input().nextLine();
        System.out.println("Nh???p di???n t??ch s??? d???ng:");
        int dienTichSuDung = input().nextInt();
        System.out.println("Nh???p ki???u thu??: ");
        String kieuThue = input().nextLine();
        System.out.println("Chi Ph?? Thu??: ");
        Double chiPhiThue  = input().nextDouble();
        System.out.println("D???ch V??? Mi???n Ph?? ??i K??m:");
        String dichVuMienPhiDiKem = input().nextLine();
        Room room = new Room(tenDichVu, soLuongNguoiToiDa, dienTichSuDung, kieuThue, chiPhiThue, dichVuMienPhiDiKem);
        roomList.add(room);
    }
    public static void showRoom(){
        for(Room room : roomList){
            System.out.println(room.showInfor());
        }
    }
    public static void showAllNameVillaNotDuplicate(){
        villaTreeSet.addAll(villaList);
        for(Villa villa: villaTreeSet){
            System.out.println(villa.showInfor());
        }

    }
    public static void showAllNameRoomNotDuplicate(){
        roomTreeSet.addAll(roomList);
        for(Room room:roomList){
            System.out.println(room.showInfor());
        }

    }
    public static void showAllNameHouseNotDuplicate(){
        houseTreeSet.addAll(houseList);
        for(House house:houseList){
            System.out.println(house.showInfor());
        }
    }
    public static void showService(){
            System.out.println("1.Show all Villa");
            System.out.println("2.Show all House");
            System.out.println("3.Show all Room");
            System.out.println("4.Show All Name Villa Not Duplicate");
            System.out.println("5.Show All Name House Not Duplicate");
            System.out.println("6.Show All Name Room Not Duplicate");
            System.out.println("7.Back to menu");
            System.out.println("8.Exit");
            switch (input().nextInt()) {
                case 1:
                    showVilla();
                    break;
                case 2:
                    showHouse();
                    break;
                case 3:
                    showRoom();
                    break;
                case 4:
                    showAllNameVillaNotDuplicate();
                    break;
                case 5:
                    showAllNameHouseNotDuplicate();
                    break;
                case 6:
                    showAllNameRoomNotDuplicate();
                    break;
            }
    }

    public static void addNewCustomer(){
        System.out.println("Nh???p id:");
        int id = input().nextInt();
        System.out.println("Nh???p h??? t??n:");
        String hoten = input().nextLine();
        System.out.println("Nh???p ngay sinh:");
        int ngaysinh = input().nextInt() ;
        System.out.println("Nh???p gioi tinh: ");
        String Gioitinh = input().nextLine();
        System.out.println("nhap CMND: ");
        int CMND  = input().nextInt();
        System.out.println("NHAP SDT:");
        int SDT = input().nextInt();
        System.out.println("NHAP EMAIL");
        String EMAIL =input().nextLine();
        System.out.println("Nhap Loai Khach");
        String Loaikhach = input().nextLine();
        System.out.println("nhap dia chi");
        String Diachi = input().nextLine();
        customer customer1 = new customer(id,hoten,ngaysinh,Gioitinh,CMND,SDT,EMAIL,Loaikhach,Diachi);
        customerList.add(customer1);
    }
    public static void addNewBooking(){

    }

}
