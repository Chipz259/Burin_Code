def coinExchange(amount,coins):
    print(f"Amount: {amount}")
    value = sorted(coins.keys(),reverse=True)
    used_coins = {coin: 0 for coin in value}
    total = 0
    remainding_amount = amount

    for i in value:
        if remainding_amount <= 0:
            break
        need = remainding_amount // i
        use = min(need,coins[i])
        used_coins[i] = use
        remainding_amount -= (use * i)
        total += use

    if remainding_amount > 0:
        print("Coins are not enough.")
    else:
        print("Coin exchange result:")
        for i in value:
            print(f"  {i} baht = {used_coins[i]} coins")
        print(f"Number of coins: {total}")

""" input """
def convert_key(data):
    """JSON"""
    return {int(k): v for k, v in data.items()}

def main():
    import json
    money = int(input())
    data = convert_key(json.loads(input()))
    coinExchange(money,data)
main()