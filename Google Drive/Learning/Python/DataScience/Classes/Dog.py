# -*- coding: utf-8 -*-
"""
Created on Mon Feb 17 01:08:13 2020

@author: OAdeoye
"""

class Dog:
    def __init__(self, name):
        self.name = name
    def respond_to_command(self, command):
        if (command == self.name):
            print(self.name + " is Barking!!!")


bingo = Dog("Bingo")
bingo.respond_to_command("Bingo")

bingo = Dog("Winco")
bingo.respond_to_command("Bingo")