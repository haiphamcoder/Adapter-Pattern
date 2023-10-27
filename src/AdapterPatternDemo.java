import com.example.adapterpattern.adapters.RectanglePegAdapter;
import com.example.adapterpattern.adapters.SquarePegAdapter;
import com.example.adapterpattern.adapters.TrianglePegAdapter;
import com.example.adapterpattern.holes.RoundHole;
import com.example.adapterpattern.pegs.RectanglePeg;
import com.example.adapterpattern.pegs.RoundPeg;
import com.example.adapterpattern.pegs.SquarePeg;
import com.example.adapterpattern.pegs.TrianglePeg;

public class AdapterPatternDemo {
    public static void main(String[] args) throws Exception {
        RoundHole hole = new RoundHole(10);
        RoundPeg roundPeg = new RoundPeg(10);
        SquarePeg squarePeg = new SquarePeg(20);
        TrianglePeg trianglePeg = new TrianglePeg(10, 10, 10);
        RectanglePeg rectanglePeg = new RectanglePeg(10, 20);

        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        TrianglePegAdapter trianglePegAdapter = new TrianglePegAdapter(trianglePeg);
        RectanglePegAdapter rectanglePegAdapter = new RectanglePegAdapter(rectanglePeg);

        if (hole.fits(roundPeg)) {
            System.out.println("Round peg fits round hole");
        } else {
            System.out.println("Round peg does not fit round hole");
        }

        if (hole.fits(squarePegAdapter)) {
            System.out.println("Square peg fits round hole");
        } else {
            System.out.println("Square peg does not fit round hole");
        }

        if (hole.fits(trianglePegAdapter)) {
            System.out.println("Triangle peg fits round hole");
        } else {
            System.out.println("Triangle peg does not fit round hole");
        }

        if (hole.fits(rectanglePegAdapter)) {
            System.out.println("Rectangle peg fits round hole");
        } else {
            System.out.println("Rectangle peg does not fit round hole");
        }
    }
}
