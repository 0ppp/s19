object Prg7
{
	def main(args:Array[String])
	{
			println("A:(List style, java style, fill, range, tabulate methods)")
		var l1:List[Int]=1::2::3::Nil;//Lisp Method
		println(l1);
		
		var l2:List[Int]=List(1,2,3);//Java Method
		println(l2);
		
		var l3:List[String]=List.fill(3)("HELLO");//Fill
		println(l3);
		
		var l4:List[Int]=List.range(1,5);//range
		println(l4);
		
		var l5:List[Int]=List.tabulate(5)(n=>n*n);//tabulate
		println(l5);

		println("B:list of 50 member using function 2n+3")
		var l6:List[Int]=List.tabulate(50)(n=>2*n+3);
		println(l6)

		var l7:List[Int]=l6.filter(n=>n%5!=0)
		println("elements exculding multiple of 5")
		println(l7)
	}
}
