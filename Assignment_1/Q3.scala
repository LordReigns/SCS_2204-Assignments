// Index No 19000032
object Q3 extends App{

    def discount_cost(n: Int): Double = (n * 24.95 * 60)/100;
    
    def shipping_cost(n: Int): Double = {
        
        if(n < 51){
            return 3 * 50
        }
        else{
            return 3*50 + (n-50)*0.75
        }
    }

    def wholesale_cost(n: Int): Double = discount_cost(n) + shipping_cost(n)
   
    println("The wholesale cost of 60 books is Rs "+ wholesale_cost(60))

}