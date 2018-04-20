package hello;

public class Car {
	int capaciteReservoirEssence;
	int consommationEssencePar100Km;
	public double distanceMaximumTheorique() {
		return 100.0 *capaciteReservoirEssence / consommationEssencePar100Km;
	}
}
