import string


class News:
    title: string = None
    content: string = None
    published_on: string = None
    published_by: string = None

    def __init__(self, title: string, content: string, date: string, author: string):
        self.title = title
        self.content = content
        self.published_on = date
        self.published_by = author

    def get_title(self):
        return self.title

    def get_content(self):
        return self.content

    def get_published_by(self):
        return self.published_by

    def get_published_on(self):
        return self.published_on

    def print_formatted_news(self):
        print("--------------")
        print("Published by: {} | Date: {}".format(self.published_by, self.published_on))
        print("Title: {}".format(self.title))
        print("Content: {}".format(self.content))
        print("--------------")
        