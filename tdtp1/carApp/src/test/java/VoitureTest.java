import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class VoitureTest {

    private Car voiture;

    @BeforeEach
    public void setUp() {
        voiture = new Car("Sedan", "Bleu");
    }

    @Test
    public void testAccelerer() {
        voiture.accelerate();
        assertThat(voiture.getSpeed()).isEqualTo(10);
    }

    @Test
    public void testRalentir() {
        voiture.accelerate();
        voiture.slowDown();
        assertThat(voiture.getSpeed()).isEqualTo(0);
    }
}
