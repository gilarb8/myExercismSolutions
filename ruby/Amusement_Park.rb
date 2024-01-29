class Attendee
  # Initializes a new Attendee instance with a given height.
  def initialize(height)
    @height = height
    @pass_id = nil
  end

  # Returns the height of the Attendee.
  def height
    @height
  end

  # Returns the pass ID of the Attendee, or nil if no pass is issued.
  def pass_id
    @pass_id
  end

  # Issues a pass to the Attendee by setting the pass ID.
  def issue_pass!(pass_id)
    @pass_id = pass_id
  end

  # Revokes the pass of the Attendee by setting the pass ID to nil.
  def revoke_pass!
    @pass_id = nil
  end
end
