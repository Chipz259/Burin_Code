'''das'''
def convert_string_to_tuples(text_in):
    '''das'''
    values = text_in.strip('()').split(', ')
    a = float(values[0])
    b = float(values[1])
    print(f"({b}, {a})")
    return tuple(map(float, values))

laongdao_data = convert_string_to_tuples(input())
