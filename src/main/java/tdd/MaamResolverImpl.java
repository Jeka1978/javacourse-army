package tdd;

/**
 * @author Evgeny Borisov
 */
public class MaamResolverImpl implements MaamResolver {
    private double maam;

    public MaamResolverImpl() {
        // code which goes to mas ahnasa web service and takes maam
        System.out.println("3 seconds to wait");
        maam = 0;
    }

    @Override
    public double getMaam() {
        return maam;
    }
}
