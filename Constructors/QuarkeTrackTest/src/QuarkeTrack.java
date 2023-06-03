import java.util.Arrays;
import java.util.Objects;

public class QuarkeTrack {
    private final int totalDistance;

    public QuarkeTrack(int[] lines) {
        this.totalDistance = Arrays.stream(lines).sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuarkeTrack quarkeTrack = (QuarkeTrack) o;
        return this.totalDistance == quarkeTrack.totalDistance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalDistance);
    }
}