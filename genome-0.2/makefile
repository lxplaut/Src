# module name
NAME = genome

# switches
SW = -O2 -Wall

# libreries
LIB = -lm

# compiler
CC = g++

# main module 

OBJ = Main.o genome.o  Random.o Error.o stochastic.o

$(NAME): $(OBJ)
	$(CC) -o $(NAME) $(OBJ) $(LIB) $(SW)

.cpp.o : 
	$(CC) $(SW) -o $@ -c $*.cpp 

.SUFFIXES : .cpp .c .o $(SUFFIXES)

clean : 
	rm -rf *.o core*

