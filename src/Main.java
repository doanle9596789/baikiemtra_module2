public class Main {
    public static void main(String[] args) {
        hinhthang hinhthang1=new hinhthang(12,10,7,7,8);
        hinhthang hinhthang2=new hinhthang(10,7,5,4,5);
        System.out.println("chu vi hinh thang 1 la" +" "+hinhthang1.tinhchuvi());
        System.out.println("chu vi hinh thang 2 la" +" " + hinhthang2.tinhchuvi());
        if (hinhthang1.tinhchuvi()>hinhthang2.tinhchuvi()){
            System.out.println("chu vi hình thang 1 lớn hơn chu vi hình thang 2" );
        }else if (hinhthang1.tinhchuvi()==hinhthang2.tinhchuvi()){
            System.out.println("chu vi hinh thang 1 bằng chu vi hình thang 2");
        }else if (hinhthang1.tinhchuvi()<hinhthang2.tinhchuvi()){
            System.out.println("chu vi hinh thang 1 nhỏ hơn chu vi hinh thang 2");
        }
        System.out.println("dien tích hình thang 1 là" + " " + hinhthang1.tinhdientich());
        System.out.println("dien tich hinh thang 2 là" +" " + hinhthang2.tinhdientich());
        if (hinhthang1.tinhdientich()>hinhthang2.tinhdientich()){
            System.out.println("diện tích hình thang 1 lớn hơn diện tích hình thang 2");
        }else if (hinhthang1.tinhdientich()==hinhthang2.tinhdientich()){
            System.out.println("dien tich hinh thang 1 bằng diện tich hình thang 2");
        }else if (hinhthang1.tinhdientich()<hinhthang2.tinhdientich()){
            System.out.println("diện tích hình thang 1 nhỏ hơn diện tích hình thang 2");
        }
    }
}