import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class ObjectJava8 {
	
public static void main(String [] args){
	int [] a={54,8,26,7};
	IntStream sum=IntStream.of(a).sorted();
	sum.forEach(sup->{
		System.out.println(sup);
	});
	System.out.println();
	Hammer h1=new Hammer(10,"Crazy Shekar",15);
	Hammer h2=new Hammer(11,"Ram bhai",25);
	Hammer h3=new Hammer(12,"Vijith",45);
	Hammer h4=new Hammer(13,"Shekar",85);
	Hammer h5=new Hammer(14,"heklar",65);
	Hammer h6=new Hammer(15,"kary",35);
	Hammer h7=new Hammer(16,"Crar",15);
	Hammer h8=new Hammer(17,"zyekar",25);
	
	List<Hammer> hammers=new ArrayList<Hammer>();
	hammers.add(h1);hammers.add(h2);hammers.add(h3);hammers.add(h4);hammers.add(h5);hammers.add(h8);hammers.add(h7);hammers.add(h6);
	
	//System.out.println(hammers.size());
	Stream <Hammer> hamStream=hammers.stream();
	/*
	hamStream.forEach(ham->{
		System.out.println(ham.age);
	});
	hamStream.filter(ham->{
		return ham.age>35;
	}).forEach(eachHam->{
		System.out.println(eachHam.age+" "+eachHam.name);
	});
	*/
	Comparator<Hammer>hamComp=(ham1,ham2)->{
		return Integer.compare(ham1.age, ham2.age);
	};
	Comparator<Hammer>hamStringComp=(ham1,ham2)->{
		return ham1.name.compareTo(ham2.name);
	};
	
	/*
	hamStream.sorted(hamComp).forEach(eachHam->{
		System.out.println(eachHam.age+" "+eachHam.name);
	});
	*/
	System.out.println();
	
	hamStream.sorted(hamStringComp).forEach(eachHam->{
		System.out.println(eachHam.age+" "+eachHam.name);
	});
	
	/*
	String [] streams={"Vijith","Victor"};
	Stream<String> s=Stream.of(streams);
	
s.filter(str->{
		return str.startsWith("V");
	}).forEach(System.out::println);
*/
}

}
