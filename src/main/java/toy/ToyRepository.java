package toy;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

import io.spring.guides.gs_producing_web_service.JobID;
import io.spring.guides.gs_producing_web_service.Toy;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class ToyRepository {
	private static final List<Toy> toys = new ArrayList<Toy>();

	@PostConstruct
	public void initData() {
		Toy barbie = new Toy();
		barbie.setName("Barbie");
		barbie.setSize(5.6);
		barbie.setCompany("Mattel");

		toys.add(barbie);

		Toy lego = new Toy();
		lego.setName("Lego");
		lego.setSize(8.5);
		lego.setCompany("The Lego Group");

		toys.add(lego);

	}

	public Toy findToy(String name) {
		Assert.notNull(name);

		Toy result = null;

		for (Toy toy : toys) {
			if (name.equals(toy.getName())) {
				result = toy;
			}
		}

		return result;
	}
	
	public JobID findJobID(int job) {
		JobID result = new JobID();
		result.setJobID(job*2+1);
		return result;		
	}
}
