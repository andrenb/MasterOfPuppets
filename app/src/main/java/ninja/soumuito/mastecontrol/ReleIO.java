package ninja.soumuito.mastecontrol;

/**
 * Created by root on 17/03/18.
 */

public class ReleIO {

    public boolean D0 ;
    public boolean D1 ;
    public boolean D2 ;
    public boolean D3 ;
    public boolean D4 ;
    public boolean other ;
    public boolean sound ;
    public boolean shelf ;

    public boolean isD0() {
        return D0;
    }

    public void setD0(boolean d0) {
        D0 = d0;
    }

    public boolean isD1() {
        return D1;
    }

    public void setD1(boolean d1) {
        D1 = d1;
    }

    public boolean isD2() {
        return D2;
    }

    public void setD2(boolean d2) {
        D2 = d2;
    }

    public boolean isD3() {
        return D3;
    }

    public void setD3(boolean d3) {
        D3 = d3;
    }

    public boolean isD4() {
        return D4;
    }

    public void setD4(boolean d4) {
        D4 = d4;
    }

    public boolean isOther() {
        return other;
    }

    public void setOther(boolean other) {
        this.other = other;
    }

    public boolean isSound() {
        return sound;
    }

    public void setSound(boolean sound) {
        this.sound = sound;
    }

    public boolean isShelf() {
        return shelf;
    }

    public void setShelf(boolean shelf) {
        this.shelf = shelf;
    }
}
