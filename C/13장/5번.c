#include <stdio.h>

typedef struct point
{
   int x, y;
}P;

int equal(P p1, P p2);

int main()
{
   P p1 = { 1,2 }, p2 = { 3,5 };
   if (equal(p1, p2) == 0)
   {
      printf("(%d, %d) != (%d, %d)", p1.x, p1.y, p2.x, p2.y);
   }
   else
      printf("(%d, %d) == (%d, %d)", p1.x, p1.y, p2.x, p2.y);
}

int equal(P p1, P p2)
{
   if ((p1.x == p2.x) && (p1.y == p2.y))
      return 1;
   else
      return 0;
}
