public class testsanpham {
    private double maSp;
    private String tenSp;
    private double giaSp;
    private double soluongSp;
    private double khuyenmaiSp;
    public testsanpham(double maSp, String tenSp,double giaSp,double soluongSp,double khuyenmaiSp){
        this.maSp=maSp;
        this.tenSp=tenSp;
        this.giaSp=giaSp;
        this.soluongSp=soluongSp;
        this.khuyenmaiSp=khuyenmaiSp;
    }
    public double getMaSp() {
        return maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public double getGiaSp() {
        return giaSp;
    }

    public double getSoluongSp() {
        return soluongSp;
    }

    public double getKhuyenmaiSp() {
        return khuyenmaiSp;
    }

    public void setGiaSp(double giaSp) {
        this.giaSp = giaSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public void setKhuyenmaiSp(double khuyenmaiSp) {
        this.khuyenmaiSp = khuyenmaiSp;
    }

    public void setMaSp(double maSp) {
        this.maSp = maSp;
    }

    public void setSoluongSp(double soluongSp) {
        this.soluongSp = soluongSp;
    } public double tientruockhuyenmai(){
        return soluongSp*giaSp;
    }
    public double tiensaukhuyenmai(){
        return soluongSp*(100- khuyenmaiSp)*giaSp/100;
    }
}
