class Flowerpot:
    total_number_of_shoots = 0

    def __init__(self, number_of_shoots=1, color_of_flowerpot="green", presence_of_thorns="yes",
                 number_of_flowering=3, number_of_nodes=11):
        __number_of_shoots= number_of_shoots
        self.color_of_flowerpot = color_of_flowerpot
        self.presence_of_thorns = presence_of_thorns
        self.number_of_flowering = number_of_flowering
        self.number_of_nodes = number_of_nodes
        Flowerpot.total_number_of_shoots += number_of_shoots


    def toString(self):
        print("number of shoots = " + str(self.number_of_shoots) + " color_of_flowerpot = " + self.color_of_flowerpot+
              " presence_of_thorns = " + self.presence_of_thorns + " number_of_flowering = " + str(self.number_of_flowering)+
              " number_of_nodes=" + str(self.number_of_nodes))


    def printSum(self):
        print("total_number_of_shoots= ", Flowerpot.total_number_of_shoots)

    @staticmethod
    def printStaticSum():
        print("total_number_of_shoots = ", Flowerpot.total_number_of_shoots)


if __name__ == '__main__':
    kalanchoe = Flowerpot()
    cactus = Flowerpot(1, "green", "yes", 1)
    croton = Flowerpot(6, "red", "no", 10, 8)

    kalanchoe.toString()
    kalanchoe.printSum()

    cactus.toString()
    cactus.printSum()

    croton.toString()
    croton.printSum()

    Flowerpot.printStaticSum()