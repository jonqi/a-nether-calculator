def get_coordinate(x):
    while True:
        x_coord = input(f"{x} Coordinate: ")
        try:
            x_coord = float(x_coord) / 8
            break
        except ValueError:
            print("Please input a number.")
    return x_coord


x_coord = get_coordinate("X")
y_coord = get_coordinate("Y") * 8
z_coord = get_coordinate("Z")

print(f"({x_coord}, {y_coord}, {z_coord})")
