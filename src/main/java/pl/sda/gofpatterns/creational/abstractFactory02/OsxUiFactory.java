package pl.sda.gofpatterns.creational.abstractFactory02;

class OsxUiFactory implements UiAbstractFactory {
    public Button getButton() {
        return new OsxButton();
    }

    public Input getInput() {
        return new OsxInput();
    }
}
