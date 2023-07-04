clc();
clear();
function n=leer()
    printf("Ingrese la cantidad de clientes ");
    n=input('');
endfunction
cant=leer();
function ma=cargar(n)
    for i=1:5
        for j=1:n
            printf("Matriz[%d,%d]",i,j);   
            ma(i,j)=input('');
            while(ma(i,j)<1)     
                 ma(i,j)=input('');
            end
            while (ma(i,j)>10)  
                 ma(i,j)=input('');
            end
        end
    end
endfunction

matriz=cargar(cant);
disp(matriz);

function p=literal1(matriz,n)
    
    for i=1:5
        s=0;
        for j=1:n
            s=s+matriz(i,j);
        end
        p(i)=s/n;
        printf("\nPromedio aspecto %d es igual a %.2f",i,p(i));
    end
endfunction
v=literal1(matriz,cant);
function literal2(v)
    printf("\nVector original");
    disp(v);
    aux=0;
    for i=1:4
        for j=(i+1):5
            if (v(i)<v(j))
                aux=v(i);
                v(i)=v(j);
                v(j)=aux;
            end
        end
    end
    printf("Vector ordenado");
    disp(v);
endfunction
literal2(v);
function literal3(v)
    suma=sum(v);
    prom=suma/5;
    printf("\n\nEl promedio del experimento es %.2f",prom)
endfunction
literal3(v);
