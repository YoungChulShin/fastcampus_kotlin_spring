public enum EnumExample implements PayableExample {

  UNPAID("미지급") {
    @Override
    public boolean isPayable() {
      return false;
    }
  },
  PAID("지급완료") {
    @Override
    public boolean isPayable() {
      return false;
    }
  },
  FAILED("지급실패") {
    @Override
    public boolean isPayable() {
      return false;
    }
  },
  REFUNDED("환급") {
    @Override
    public boolean isPayable() {
      return false;
    }
  };

  private final String lable;

  EnumExample(String lable) {
    this.lable = lable;
  }
}