#include<stdio.h>

typedef struct complex 
{
    double real;
    double imag;
}C;

C complex_add(C c1, C c2);

int main()
{
    C c1 = { 1,2 }, c2 = { 2,3 }, c3;
    c3 = complex_add(c1, c2);
    printf("%lf+%lfi\n", c1.real, c1.imag);
    printf("%lf+%lfi\n", c2.real, c2.imag);
    printf("%lf+%lfi\n", c3.real, c3.imag);
}

C complex_add(C c1, C c2)
{
    C result;
    result.real = c1.real + c2.real;
    result.imag = c1.imag + c2.imag;

    return result;
}
