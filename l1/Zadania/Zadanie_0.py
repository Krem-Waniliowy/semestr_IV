import random


# Pobieranie liczby (konwertuje tekst na liczbę całkowitą)
def get_number(a, b):
    while True:
        try:
            text = input(f"Podaj liczbę całkowitą z przedziału od {a} do {b}: ")
            number = int(text)

        except ValueError:
            print(f"Podaj liczbę!\n")

        else:
            if a << number << b:
                return number


# Testowanie get_number -> DZIAŁA


# Tworzy i zwraca zbiór współrzędnych punktów min (współrzędne jako tuple)
# number -> ilość min
# size -> wymiar planszy (size x size)
def lay_mines(number, size):
    mines = []

    used_x = random.sample(range(1, size + 1), number)
    used_y = random.sample(range(1, size + 1), number)

    for i in range(10):
        mines.append((used_x[i], used_y[i]))

    return set(mines)


# Testowanie lay_mines -> DZIAŁA

# Zwraca liczbę min sąsiadujących z punktem o podanych współrzędnych x oraz y
def number_of_neighbouring_mines(x, y, mines):
    count = 0
    for mine in [(x-1, y-1), (x-1, y), (x-1, y+1),
                     (x, y-1), (x, y+1),
                     (x+1, y-1), (x+1, y), (x+1, y+1)]:
        if mine in mines:
            count += 1
    return count

def create_board(size, mines):
    board = []

    for i in range(size):
        row = ["0"] * size
        board.append(row)

    for x in range(size):
        for y in range(size):
            if (x, y) in mines:
                board[x][y] = "*"
            else:
                board[x][y] = str(number_of_neighbouring_mines(x, y, mines))

    return board


def print_board(board):
    size = len(board)
    print("   ", end="")
    for i in range(size):
        print(f"{i:2}", end="")
    print()
    print("  ", end="")
    print("-" * (size * 2))

    for i, row in enumerate(board):
        print(f"{i:2}|", end="")
        for cell in row:
            print(f" {cell}", end="")
        print()


mines = lay_mines(10, 10)
board = create_board(10, mines)

print_board(board)
