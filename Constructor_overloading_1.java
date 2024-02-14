//this is a classic example of constructor overloading



public class Constructor_overloading_1{
    
    public static void main(String[] args){
        
        Box cube = new Box(2);
        cube.volume();
        
        Box cuboid = new Box(2,3,4);
        cuboid.volume();
        
        Box nothing = new Box();
        nothing.volume();
        
        
    }
}

class Box{
    
    int length, width, height;
    
    Box(int l, int w, int h){
        
        this.length =l;
        this.width =w;
        this.height =h;
    }
    
    Box(int o){
        
        this.length =o;
        this.width =o;
        this.height =o;
    }
    
    Box(){
        this.length =0;
        this.width =0;
        this.height =0;
        
    }
    
    public void volume(){
        
        int vol = this.length*this.width*this.height;
        if(vol==0){
            System.out.println("Your box is a nothing box");
        }else{
        System.out.println("And the volume of your shape is : "+vol);
        System.out.println();
        }
            
    }
    
}



