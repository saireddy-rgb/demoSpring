package org.saireddy;

public class Dev {

        private Computer com;


    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void build(){
        System.out.println("in build, in dev");
        com.compile();
    }
}
