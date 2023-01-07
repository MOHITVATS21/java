public class RectangularGrid
{
    public static void main(String[] args)
    {
        System.out.println(countRectangles(592,964));
    }

    public static long countRectangles(int m, int n)
    {
        long tot_rect = (long)(((m*m)+m)*((n*n)+n))/4;
        long tot_square = 0;
        boolean status = true;

        while(status)
        {
            if(m>0 && n>0)
            {
                tot_square+=(long)m*n;
                --m;
                --n;
            }
            else
            {
                status = false;
            }

        }


        return tot_rect-tot_square;
    }
}