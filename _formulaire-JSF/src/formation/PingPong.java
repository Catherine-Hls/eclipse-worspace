package formation;

import java.util.Random;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean (name = "pingpong", eager = true)
@SessionScoped
public class PingPong {
	String editg = "coucou";
	String editd = "salut";
	int label = 0;
	int firstLabel = 0;
	int secondLabel = 0;
	int thirdLabel = 0;
	
		
	public int getFirstLabel() {
		return firstLabel;
	}
	public void setFirstLabel(int firstLabel) {
		this.firstLabel = firstLabel;
	}
	public int getSecondLabel() {
		return secondLabel;
	}
	public void setSecondLabel(int secondLabel) {
		this.secondLabel = secondLabel;
	}
	public int getThirdLabel() {
		return thirdLabel;
	}
	public void setThirdLabel(int thirdLabel) {
		this.thirdLabel = thirdLabel;
	}
	public int getLabel() {
		return label;
	}
	public void setLabel(int label) {
		this.label = label;
	}
	public String getEditg() {
		return editg;
	}
	public void setEditg(String editg) {
		this.editg = editg;
	}
	public String getEditd() {
		return editd;
	}
	public void setEditd(String editd) {
		this.editd = editd;
	}
	
	public void moveR2L() {
		editg = editd;
		editd = "";
	}
	public void moveL2R() {
		editd = editg;
		editg = "";
	}
	public void reset() {
		editg = "coucou";
		editd = "salut";
	}
	public void ok() {
		label += 1;
	}
	
	public void ok2() {
		if (firstLabel <10) {
			firstLabel += 1;
		} if (firstLabel == 9) {
			firstLabel = 0;
			secondLabel +=1; 
		} if (secondLabel == 9) {
			thirdLabel +=1;
		}	
	}
	
	public void random() {
		Random rand = new Random();
		   firstLabel = rand.nextInt((9 - 0) + 0) + 0;
		   secondLabel = rand.nextInt((9 - 0) + 0) + 0;
		   thirdLabel = rand.nextInt((9 - 0) + 0) + 0;
	}
		 
	
}
